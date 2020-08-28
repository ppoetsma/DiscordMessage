# DiscordMessage

This module has a single purpose: send messages to Discord channels.

## Features

Its features are

* uses Discord channel Webhooks
* Webhook URLs are stored encrypted
* send messages to multiple channels in multiple servers
* messages can be sent in the background, not delaying your primary process
* no Java libraries that require maintenance, just native Mendix
* Dutch and English languages are supported in the UI

## Installation

Download the module from the AppStore and add it to your project.

Add microflow `ASu_DiscordMessage` to your app's AfterStartup microflow.

The module depends on AppStore module [CommunityCommons](https://appstore.home.mendix.com/link/app/170/).

## Constants

The module adds these constants to your app and adjust them when needed.

* `DiscordMessage.AutoCreateWebhook` - Automatically create the requested webhook, marked invalid, to be completed later. Every used webhook should be defined and marked valid. But when an unknown webhook is used then it is added to be completed manually.
* `DiscordMessage.SendEnabled` - By default messages are sent on test, acceptance and production systems. In case you want to disable sending messages on a specific system then set this constant to FALSE in the environment's configuration.
* `DiscordMessage.SendEnabledInDev` - By default messages are not sent on development systems. This prevents messages being sent while developing an app. However when you want messages to be sent, change this constant value to TRUE in your project's profile.
* `DiscordMessage.RequestTimeout` - Discord web service request timeout in seconds.

This constant is added and you have to change it because the default value is unusable:

* `DiscordMessage.EncryptionKey` - The encryption key used to encrypt sensitive data like the Incoming Webhook URL which does not need authentication. Its length should exactly be 16 characters (128 bit). By default this key is not set so you have to create your own secure key. It is advised to use a combination of uppercase and lowercase characters, digits and special characters.

This constant is added but you should not change it:

* `DiscordMessage.EncryptionPrefix` - A string that indicates if a string is encrypted or not. Changing it might prevent you to upgrade in the future.

## Security

The module offers these two roles:

* `Administrator` - manage Webhooks
* `User` - the minimum needed for regular users

## Create Webhook(s) in Discord

First you have to create one or more Webhooks in Discord. Assuming you have the appropriate permissions in the Discord server, right click on the channel and select **Edit Channel**. On the channel edit page on the left hand side select **Integrations**. Here you can manage existing channel webhooks and add a new webhook.

## Store Webhook(s) in your app

The module offers two methods of storing and using Webhook URLs:

1. create Webhook objects (provided by the module) where the URL is stored encrypted and in your microflows you refer to it using a unique key
2. store URLs using your own method and provide the clear text URL when sending messages

Which way is used to store the URLs in an app is not that important, pick what fits your app and requirements best. The convenience microflows described below support both.

### Store in entity Webhook

One way is to store URLs in entity `Webhook`. This allows the developer to store URLs **encrypted** and use multiple webhooks in the app easily. The URLs are stored encrypted because they can be used without any means of authentication.

The entity has these attributes (all are required):

* `Label` - a descriptive human readable label
* `Key` - a sort unique key to be used in your microflows to find the right Webhook; only lowercase and uppercase characters, digits and underscores are allowed here
* `URL` - the Webhook URL

It is highly recommended to store the values for `Key` in an enumeration. This makes using them more consistent and prevents error by typos.

Add snippet `SN_Webhook` to a page to manage your Webhooks manually. Additionally you can use microflow `Webhook_Upsert` in for example the AfterStartup flow to add them to the database on app start automatically.

### Store using your own method

Another way is to store URLs using your own method and not use entity `Webhook` at all. For example the app uses just a single Webhook and its URL is stored in a constant. If encrypting the URL is less important then there is no need to create `Webhook` object. The module provides microflows that can send messages to Discord based on a clear text URL.

## Create and send a message

The microflows `Message_CreateAndSendToWebhookKey` and `Message_CreateAndSendToWebhookURL` can be used to send a message to Discord.

The first microflow expects a `Webhook` object with the specified `key` to be in the database. The second microflow accepts a Webhook URL as input.

The microflows have these parameters:

* `MessageText` - the message, max 2000 characters
* `SendBy` - the name used to post the message in the channel
* `TextToSpeech` - when TRUE then the message is read out loud using TTS
* `WebhookKey` or `WebhookURL` - the key or full URL of the Webhook to send the message to
* `SendAsync` - use TRUE (preferred) to send the message in a separate background thread or FALSE to send it in the same thread

On failure check the log file for details.

## Test creating and sending messages

[The GitHub repo](https://github.com/ppoetsma/DiscordMessage) contains a Mendix model with features that can be used to test the module before adding it to your project. Snippet `SN_Webhook` has test features as well.

## Feedback

Please leave your feedback in [the GitHub repo](https://github.com/ppoetsma/DiscordMessage/issues).

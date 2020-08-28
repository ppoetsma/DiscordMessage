// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package discordmessage.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the DiscordMessage module
	public static void act_Webhook_New(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DiscordMessage.Act_Webhook_New", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void act_Webhook_Save(IContext context, discordmessage.proxies.Webhook _webhook)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Webhook", _webhook == null ? null : _webhook.getMendixObject());
			Core.execute(context, "DiscordMessage.Act_Webhook_Save", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void act_Webhook_SendTestMessage(IContext context, discordmessage.proxies.Webhook _webhook)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Webhook", _webhook == null ? null : _webhook.getMendixObject());
			Core.execute(context, "DiscordMessage.Act_Webhook_SendTestMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void act_Webhook_SendTestMessageTTS(IContext context, discordmessage.proxies.Webhook _webhook)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Webhook", _webhook == null ? null : _webhook.getMendixObject());
			Core.execute(context, "DiscordMessage.Act_Webhook_SendTestMessageTTS", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aSu_DiscordMessage(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DiscordMessage.ASu_DiscordMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean bCo_Webhook(IContext context, discordmessage.proxies.Webhook _webhook)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Webhook", _webhook == null ? null : _webhook.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.BCo_Webhook", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String decryptString(IContext context, java.lang.String _stringToDecrypt)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("StringToDecrypt", _stringToDecrypt);
			return (java.lang.String)Core.execute(context, "DiscordMessage.DecryptString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String encryptString(IContext context, java.lang.String _stringToEncrypt)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("StringToEncrypt", _stringToEncrypt);
			return (java.lang.String)Core.execute(context, "DiscordMessage.EncryptString", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static discordmessage.proxies.Message message_Create(IContext context, java.lang.String _messageText, java.lang.String _sendBy, boolean _textToSpeech, boolean _sendAsync)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MessageText", _messageText);
			params.put("SendBy", _sendBy);
			params.put("TextToSpeech", _textToSpeech);
			params.put("SendAsync", _sendAsync);
			IMendixObject result = (IMendixObject)Core.execute(context, "DiscordMessage.Message_Create", params);
			return result == null ? null : discordmessage.proxies.Message.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean message_CreateAndSendToWebhookKey(IContext context, java.lang.String _messageText, java.lang.String _sendBy, boolean _textToSpeech, boolean _sendAsync, java.lang.String _webhookKey)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MessageText", _messageText);
			params.put("SendBy", _sendBy);
			params.put("TextToSpeech", _textToSpeech);
			params.put("SendAsync", _sendAsync);
			params.put("WebhookKey", _webhookKey);
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.Message_CreateAndSendToWebhookKey", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean message_CreateAndSendToWebhookURL(IContext context, java.lang.String _messageText, java.lang.String _sendBy, boolean _textToSpeech, boolean _sendAsync, java.lang.String _webhookURL)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MessageText", _messageText);
			params.put("SendBy", _sendBy);
			params.put("TextToSpeech", _textToSpeech);
			params.put("SendAsync", _sendAsync);
			params.put("WebhookURL", _webhookURL);
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.Message_CreateAndSendToWebhookURL", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String message_ExportToJSON(IContext context, discordmessage.proxies.Message _message)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Message", _message == null ? null : _message.getMendixObject());
			return (java.lang.String)Core.execute(context, "DiscordMessage.Message_ExportToJSON", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static discordmessage.proxies.Message message_ImportFromJSON(IContext context, java.lang.String _messageJSON)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("MessageJSON", _messageJSON);
			IMendixObject result = (IMendixObject)Core.execute(context, "DiscordMessage.Message_ImportFromJSON", params);
			return result == null ? null : discordmessage.proxies.Message.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean message_SendToWebhookKey(IContext context, java.lang.String _webhookKey, discordmessage.proxies.Message _message, boolean _sendAsync)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WebhookKey", _webhookKey);
			params.put("Message", _message == null ? null : _message.getMendixObject());
			params.put("SendAsync", _sendAsync);
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.Message_SendToWebhookKey", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean message_SendToWebhookURL(IContext context, java.lang.String _webhookURL, discordmessage.proxies.Message _message, boolean _sendAsync)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WebhookURL", _webhookURL);
			params.put("Message", _message == null ? null : _message.getMendixObject());
			params.put("SendAsync", _sendAsync);
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.Message_SendToWebhookURL", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String randomJoke(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.String)Core.execute(context, "DiscordMessage.RandomJoke", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void scE_SendToDiscordHelper_Cleanup(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "DiscordMessage.ScE_SendToDiscordHelper_Cleanup", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static discordmessage.proxies.SendToDiscordHelper sendToDiscordHelper_Create(IContext context, java.lang.String _webhookString, discordmessage.proxies.EnumWebhookType _webhookType, discordmessage.proxies.Message _message, boolean _persist, boolean _sendAsync)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WebhookString", _webhookString);
			params.put("WebhookType", _webhookType == null ? null : _webhookType.name());
			params.put("Message", _message == null ? null : _message.getMendixObject());
			params.put("Persist", _persist);
			params.put("SendAsync", _sendAsync);
			IMendixObject result = (IMendixObject)Core.execute(context, "DiscordMessage.SendToDiscordHelper_Create", params);
			return result == null ? null : discordmessage.proxies.SendToDiscordHelper.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sendToDiscordHelper_Post(IContext context, discordmessage.proxies.SendToDiscordHelper _sendToDiscordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SendToDiscordHelper", _sendToDiscordHelper == null ? null : _sendToDiscordHelper.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.SendToDiscordHelper_Post", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean sendToDiscordHelper_Send(IContext context, discordmessage.proxies.SendToDiscordHelper _sendToDiscordHelper)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("SendToDiscordHelper", _sendToDiscordHelper == null ? null : _sendToDiscordHelper.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.SendToDiscordHelper_Send", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static discordmessage.proxies.Webhook webhook_Create(IContext context, java.lang.String _label, java.lang.String _key, java.lang.String _uRL, discordmessage.proxies.EnumWebhookIsValid _webhookIsValid)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Label", _label);
			params.put("Key", _key);
			params.put("URL", _uRL);
			params.put("WebhookIsValid", _webhookIsValid == null ? null : _webhookIsValid.name());
			IMendixObject result = (IMendixObject)Core.execute(context, "DiscordMessage.Webhook_Create", params);
			return result == null ? null : discordmessage.proxies.Webhook.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static discordmessage.proxies.Webhook webhook_RetrieveByKey(IContext context, java.lang.String _webhookKey, boolean _autoCreate)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WebhookKey", _webhookKey);
			params.put("AutoCreate", _autoCreate);
			IMendixObject result = (IMendixObject)Core.execute(context, "DiscordMessage.Webhook_RetrieveByKey", params);
			return result == null ? null : discordmessage.proxies.Webhook.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static discordmessage.proxies.Webhook webhook_Upsert(IContext context, java.lang.String _label, java.lang.String _key, java.lang.String _uRL)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Label", _label);
			params.put("Key", _key);
			params.put("URL", _uRL);
			IMendixObject result = (IMendixObject)Core.execute(context, "DiscordMessage.Webhook_Upsert", params);
			return result == null ? null : discordmessage.proxies.Webhook.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean webhook_Validate(IContext context, discordmessage.proxies.Webhook _webhook)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Webhook", _webhook == null ? null : _webhook.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "DiscordMessage.Webhook_Validate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}
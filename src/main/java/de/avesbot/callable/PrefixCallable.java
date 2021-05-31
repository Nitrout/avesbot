package de.avesbot.callable;

import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * @deprecated not longer needed with slash command api
 * @author Nitrout
 */
@Deprecated
public class PrefixCallable extends CommandCallable {
	
	public static final String MANUAL = "**!avesprefix** Pr�fix \t- Setzt ein neues Pr�fix f�r alle Befehle von Aves; max. 5 Zeichen";
	
	/**
	 * Creates a new prefix change callable.
	 * @param event
	 */
	public PrefixCallable(MessageReceivedEvent event) {
		super(event);
	}
	
	@Override
	public String call() throws Exception {
		
		String result;
		
		if(member.hasPermission(Permission.ADMINISTRATOR)) {
			
//			Aves.getStatementManager().updateGuildPrefix(guild, pars[0].substring(0, Math.min(5, pars[0].length())));
			result = String.format("Pr�fix ge�ndert zu: \"%s\"!", pars[0].substring(0, Math.min(5, pars[0].length())));
		} else {
			result = "Nur Administratoren k�nnen das Prefix �ndern!";
		}
		
		return result;
	}
}

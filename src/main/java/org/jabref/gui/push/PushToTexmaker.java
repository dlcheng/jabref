package org.jabref.gui.push;

import org.jabref.gui.IconTheme;
import org.jabref.gui.JabRefIcon;
import org.jabref.preferences.JabRefPreferences;

/**
 * Class for pushing entries into TexMaker.
 */
public class PushToTexmaker extends AbstractPushToApplication implements PushToApplication {

    @Override
    public String getApplicationName() {
        return "Texmaker";
    }

    @Override
    public JabRefIcon getIcon() {
        return IconTheme.JabRefIcons.APPLICATION_TEXMAKER;
    }

    @Override
    protected String[] getCommandLine(String keyString) {
        return new String[] {commandPath, "-insert", getCiteCommand() + "{" + keyString + "}"};
    }

    @Override
    protected void initParameters() {
        commandPathPreferenceKey = JabRefPreferences.TEXMAKER_PATH;
    }

}

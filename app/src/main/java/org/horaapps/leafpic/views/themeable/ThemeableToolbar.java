package org.horaapps.leafpic.views.themeable;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;

import org.horaapps.leafpic.util.ThemeHelper;
import org.horaapps.leafpic.util.Themeable;

/**
 * Created by darken (darken@darken.eu) on 04.03.2017.
 */
public class ThemeableToolbar extends Toolbar implements Themeable {
    public ThemeableToolbar(Context context) {
        this(context, null);
    }

    public ThemeableToolbar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemeableToolbar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void refreshTheme(ThemeHelper themeHelper) {
        setBackgroundColor(themeHelper.getPrimaryColor());
    }
}

package io.intercom.android.sdk.ui.theme;

import defpackage.qqc;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\nR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/ui/theme/ThemeManager;", "", "<init>", "()V", "", "updateCurrentTheme", "initialize", "Lio/intercom/android/sdk/ui/theme/ThemeMode;", "themeMode", "setSessionOverride", "(Lio/intercom/android/sdk/ui/theme/ThemeMode;)V", "clearSessionOverride", "updateServerTheme", "getCurrentThemeMode", "()Lio/intercom/android/sdk/ui/theme/ThemeMode;", "Lqqc;", "getThemeModeState", "()Lqqc;", "setThemeModeForTesting", "sessionOverride", "Lio/intercom/android/sdk/ui/theme/ThemeMode;", "serverTheme", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThemeManager {
    private static ThemeMode sessionOverride;
    public static final ThemeManager INSTANCE = new ThemeManager();
    private static ThemeMode serverTheme = ThemeMode.LIGHT;
    public static final int $stable = 8;

    private ThemeManager() {
    }

    private final void updateCurrentTheme() {
        IntercomColorsKt.getCurrentThemeMode().setValue(getCurrentThemeMode());
    }

    public final void clearSessionOverride() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final ThemeMode getCurrentThemeMode() {
        ThemeMode themeMode = sessionOverride;
        if (themeMode == null) {
            return serverTheme;
        }
        return themeMode;
    }

    public final qqc getThemeModeState() {
        return IntercomColorsKt.getCurrentThemeMode();
    }

    public final void initialize() {
        sessionOverride = null;
        updateCurrentTheme();
    }

    public final void setSessionOverride(ThemeMode themeMode) {
        themeMode.getClass();
        sessionOverride = themeMode;
        updateCurrentTheme();
    }

    public final void setThemeModeForTesting(ThemeMode themeMode) {
        themeMode.getClass();
        setSessionOverride(themeMode);
    }

    public final void updateServerTheme(ThemeMode themeMode) {
        themeMode.getClass();
        serverTheme = themeMode;
        updateCurrentTheme();
    }
}

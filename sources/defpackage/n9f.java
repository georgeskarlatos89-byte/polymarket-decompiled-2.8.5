package defpackage;

import com.polymarket.usviewmodels.ProfileSettingsViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n9f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProfileSettingsViewModel.SettingItem.SettingItemType.values().length];
        try {
            iArr[ProfileSettingsViewModel.SettingItem.SettingItemType.logout.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProfileSettingsViewModel.SettingItem.SettingItemType.addPasskey.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}

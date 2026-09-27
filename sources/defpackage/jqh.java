package defpackage;

import com.polymarket.usviewmodels.SquadsInfoItemKind;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class jqh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SquadsInfoItemKind.values().length];
        try {
            iArr[SquadsInfoItemKind.openToEveryone.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SquadsInfoItemKind.limitedNotifications.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SquadsInfoItemKind.deleteSquad.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SquadsInfoItemKind.editPermissions.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SquadsInfoItemKind.manageMembers.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SquadsInfoItemKind.customizeSquad.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SquadsInfoItemKind.messageInChat.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}

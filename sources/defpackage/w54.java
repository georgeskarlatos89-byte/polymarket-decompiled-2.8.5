package defpackage;

import com.polymarket.clients.ClientAlert;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class w54 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClientAlert.Action.Style.values().length];
        try {
            iArr[ClientAlert.Action.Style.f0default.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientAlert.Action.Style.cancel.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClientAlert.Action.Style.destructive.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClientAlert.Action.Style.plain.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}

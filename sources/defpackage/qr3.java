package defpackage;

import com.polymarket.clients.ClientChatQuotedMessage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class qr3 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClientChatQuotedMessage.PreviewKind.values().length];
        try {
            iArr[ClientChatQuotedMessage.PreviewKind.position.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientChatQuotedMessage.PreviewKind.image.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClientChatQuotedMessage.PreviewKind.sticker.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}

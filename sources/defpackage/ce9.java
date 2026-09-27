package defpackage;

import com.polymarket.clients.ClientVideoEmbedContentKind;
import com.polymarket.clients.ClientVideoEmbedPlaybackEvent;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ce9 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ClientVideoEmbedContentKind.values().length];
        try {
            iArr[ClientVideoEmbedContentKind.page.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClientVideoEmbedContentKind.remoteDocument.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ClientVideoEmbedPlaybackEvent.values().length];
        try {
            iArr2[ClientVideoEmbedPlaybackEvent.ready.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ClientVideoEmbedPlaybackEvent.playing.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ClientVideoEmbedPlaybackEvent.paused.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ClientVideoEmbedPlaybackEvent.failed.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[r98.values().length];
        try {
            iArr3[r98.Playing.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[r98.Paused.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[r98.Ready.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}

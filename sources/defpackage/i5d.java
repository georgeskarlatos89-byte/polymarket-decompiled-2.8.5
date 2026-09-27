package defpackage;

import io.intercom.android.sdk.NexusWrapper;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class i5d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NexusWrapper b;

    public /* synthetic */ i5d(NexusWrapper nexusWrapper, int i) {
        this.a = i;
        this.b = nexusWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        NexusWrapper nexusWrapper = this.b;
        switch (i) {
            case 0:
                NexusWrapper.c(nexusWrapper);
                return;
            default:
                NexusWrapper.b(nexusWrapper);
                return;
        }
    }
}

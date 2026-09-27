package defpackage;

import com.polymarket.usviewmodels.USEventCardViewModel;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class p72 implements gw6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ USEventCardViewModel b;
    public final /* synthetic */ String c;

    public /* synthetic */ p72(USEventCardViewModel uSEventCardViewModel, String str, int i) {
        this.a = i;
        this.b = uSEventCardViewModel;
        this.c = str;
    }

    @Override // defpackage.gw6
    public final void dispose() {
        int i = this.a;
        String str = this.c;
        USEventCardViewModel uSEventCardViewModel = this.b;
        switch (i) {
            case 0:
                uSEventCardViewModel.sendInput(USEventCardViewModel.Input.INSTANCE.onVisibilityChanged(false, str));
                return;
            case 1:
                uSEventCardViewModel.sendInput(USEventCardViewModel.Input.INSTANCE.onVisibilityChanged(false, str));
                return;
            default:
                uSEventCardViewModel.sendInput(USEventCardViewModel.Input.INSTANCE.onVisibilityChanged(false, str));
                return;
        }
    }
}

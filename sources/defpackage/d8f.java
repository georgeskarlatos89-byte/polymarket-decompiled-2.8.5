package defpackage;

import com.polymarket.usviewmodels.PlayerPropsSheetRequest;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerPropsSheetRequest b;

    public /* synthetic */ d8f(PlayerPropsSheetRequest playerPropsSheetRequest, int i) {
        this.a = i;
        this.b = playerPropsSheetRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        PlayerPropsSheetRequest playerPropsSheetRequest = this.b;
        switch (i) {
            case 0:
                return playerPropsSheetRequest.getEvent();
            case 1:
                return playerPropsSheetRequest.getEvent();
            default:
                return playerPropsSheetRequest.getEvent();
        }
    }
}

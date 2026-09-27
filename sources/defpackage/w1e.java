package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final /* synthetic */ class w1e implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                JsResult jsResult = (JsResult) obj;
                if (jsResult != null) {
                    jsResult.confirm();
                    return;
                }
                return;
            case 1:
                JsResult jsResult2 = (JsResult) obj;
                if (jsResult2 != null) {
                    jsResult2.cancel();
                    return;
                }
                return;
            default:
                ((FinancialConnectionsSheetLiteActivity) obj).finish();
                return;
        }
    }
}

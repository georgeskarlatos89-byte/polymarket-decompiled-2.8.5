package defpackage;

import android.webkit.ValueCallback;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity;
import io.intercom.android.sdk.helpcenter.articles.IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class be9 implements ValueCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ be9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(Boolean.valueOf(Intrinsics.areEqual((String) obj, "true")));
                return;
            default:
                IntercomArticleActivity$onCreate$1$1$3$1$1$1$1$1.a((IntercomArticleActivity) obj2, (String) obj);
                return;
        }
    }
}

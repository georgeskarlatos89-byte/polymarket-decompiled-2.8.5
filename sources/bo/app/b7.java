package bo.app;

import defpackage.u85;
import defpackage.zei;
import io.ably.lib.http.HttpConstants;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b7 extends zei implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ i7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7(String str, i7 i7Var, Continuation continuation) {
        super(2, continuation);
        this.a = str;
        this.b = i7Var;
    }

    @Override // defpackage.l81
    public final Continuation create(Object obj, Continuation continuation) {
        return new b7(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b7(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        ResultKt.a(obj);
        URLConnection openConnection = new URL(this.a).openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestProperty(HttpConstants.Headers.ACCEPT, "text/event-stream");
        httpURLConnection.setDoInput(true);
        i7 i7Var = this.b;
        i7Var.getClass();
        i7Var.c.set(httpURLConnection);
        try {
            httpURLConnection.connect();
            return httpURLConnection;
        } catch (Exception e) {
            this.b.a();
            throw e;
        }
    }
}

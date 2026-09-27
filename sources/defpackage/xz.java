package defpackage;

import android.app.Service;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.polymarket.clients.ClientWebStorage;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class xz implements ClientWebStorage, j6c, ajc, ut6, suk {
    public final /* synthetic */ int a;
    public final Context b;

    public xz(Service service) {
        this.a = 6;
        Context applicationContext = service.getApplicationContext();
        arn.h(applicationContext);
        this.b = applicationContext;
    }

    @Override // defpackage.suk
    public Object a() {
        return this.b;
    }

    @Override // defpackage.ut6
    public Class b() {
        return Drawable.class;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ah5] */
    @Override // defpackage.j6c
    public k6c c(ofc ofcVar) {
        Context context;
        int i = u1k.a;
        if (i >= 23 && (i >= 31 || ((context = this.b) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int h = ggc.h(((el8) ofcVar.c).n);
            q7m.e("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(u1k.C(h)));
            return new r66(15, new uo0(h, 0), new uo0(h, 1)).g(ofcVar);
        }
        return new Object().c(ofcVar);
    }

    @Override // com.polymarket.clients.ClientWebStorage
    public Object clear(Continuation continuation) {
        mv6 mv6Var = mv6.a;
        Object d = coc.d(qyb.b, new aa(this, null, 7), continuation);
        if (d == u85.COROUTINE_SUSPENDED) {
            return d;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.ut6
    public Object d(int i, Resources.Theme theme, Resources resources) {
        Context context = this.b;
        return fyn.b(context, context, i, theme);
    }

    @Override // defpackage.ajc
    public zic l0(m64 m64Var) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 2:
                return new rm0(context, this);
            case 3:
                return new m8c(context, 2);
            default:
                return new rm0(context, m64Var.p(Integer.class, InputStream.class));
        }
    }

    @Override // defpackage.ut6
    public void a(Object obj) {
    }

    public /* synthetic */ xz(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public xz(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }
}

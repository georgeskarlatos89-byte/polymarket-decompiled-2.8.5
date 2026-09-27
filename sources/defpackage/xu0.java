package defpackage;

import io.ably.lib.util.AgentHeaderCreator;
import io.sentry.android.core.m0;
import java.util.logging.Level;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public abstract class xu0 implements vua {
    public final /* synthetic */ int a;
    public final String b;

    public xu0(String str) {
        this.a = 1;
        this.b = StringsKt.Z(str, AgentHeaderCreator.AGENT_DIVIDER).concat("/logging");
    }

    @Override // defpackage.vua
    public void D0(xua xuaVar, String str, Object... objArr) {
        if (o(xuaVar)) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (Object obj : objArr) {
                i = mhl.b(sb, i, str, obj);
            }
            sb.append(str.substring(i));
            c(xuaVar, sb.toString());
        }
    }

    @Override // defpackage.vua
    public void T(xua xuaVar, String str, Object obj) {
        if (o(xuaVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(mhl.b(sb, 0, str, obj)));
            c(xuaVar, sb.toString());
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract void c(xua xuaVar, String str);

    public void d(RuntimeException runtimeException, tum tumVar) {
        m0.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract boolean e(Level level);

    public abstract void f(tum tumVar);

    public abstract void g(s0o s0oVar);

    public void h(RuntimeException runtimeException, s0o s0oVar) {
        m0.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract boolean i(Level level);

    @Override // defpackage.vua
    public void m0(xua xuaVar, String str, Object obj, Object obj2) {
        if (o(xuaVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(mhl.b(sb, mhl.b(sb, 0, str, obj), str, obj2)));
            c(xuaVar, sb.toString());
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vua
    public void x0(xua xuaVar, Object obj) {
        String obj2;
        if (o(xuaVar)) {
            if (obj == null) {
                obj2 = null;
            } else {
                obj2 = obj.toString();
            }
            c(xuaVar, obj2);
        }
    }

    public /* synthetic */ xu0(String str, int i) {
        this.a = i;
        this.b = str;
    }
}

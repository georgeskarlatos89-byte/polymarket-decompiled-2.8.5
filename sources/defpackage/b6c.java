package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class b6c extends Lambda implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6c(lxa lxaVar, zrf zrfVar, a3h a3hVar) {
        super(1);
        this.h = 12;
        this.i = lxaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ((Context) obj).getClass();
                Context context = (Context) obj2;
                context.getClass();
                MeasurementManager c = z39.c(context);
                c.getClass();
                return new e6c(c);
            case 1:
                ((zqc) obj2).b((ijc) obj);
                return Boolean.TRUE;
            case 2:
                ((zid) obj2).c1((lxf) obj);
                return Unit.INSTANCE;
            case 3:
                if (obj == ((pmd) obj2)) {
                    return "(this)";
                }
                return String.valueOf(obj);
            case 4:
                ((qtd) obj2).j((y07) obj);
                return Unit.INSTANCE;
            case 5:
                py0 py0Var = (py0) obj;
                py0Var.getClass();
                py0Var.a(((uyf) obj2).a, tyf.CACHE);
                return Unit.INSTANCE;
            case 6:
                py0 py0Var2 = (py0) obj;
                py0Var2.getClass();
                py0Var2.a((Map) obj2, tyf.REMOTE);
                return Unit.INSTANCE;
            case 7:
                ((m23) obj2).resumeWith(Result.m882constructorimpl(obj));
                return Unit.INSTANCE;
            case 8:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                eag eagVar = ((fag) obj2).b;
                eagVar.addAll(arrayList);
                return eagVar;
            case 9:
                mug.l((pug) obj, ((u8g) obj2).a);
                return Unit.INSTANCE;
            case 10:
                ((List) obj).add((Float) ((h2b) obj2).invoke());
                return true;
            case 11:
                d7g d7gVar = (d7g) obj;
                u0h u0hVar = (u0h) obj2;
                d7gVar.u(d7gVar.s.getDensity() * u0hVar.a);
                d7gVar.y(u0hVar.b);
                d7gVar.f(u0hVar.c);
                d7gVar.c(u0hVar.d);
                d7gVar.z(u0hVar.e);
                return Unit.INSTANCE;
            case 12:
                ((lxa) obj2).a();
                return Unit.INSTANCE;
            case 13:
                d7g d7gVar2 = (d7g) obj;
                e7h e7hVar = (e7h) obj2;
                d7gVar2.r(e7hVar.o);
                d7gVar2.s(e7hVar.p);
                d7gVar2.b(e7hVar.q);
                d7gVar2.C(0.0f);
                d7gVar2.G(0.0f);
                d7gVar2.u(e7hVar.r);
                d7gVar2.m(0.0f);
                d7gVar2.o(0.0f);
                d7gVar2.q(e7hVar.s);
                d7gVar2.e(e7hVar.t);
                d7gVar2.B(e7hVar.u);
                d7gVar2.y(e7hVar.v);
                d7gVar2.f(e7hVar.w);
                d7gVar2.j(e7hVar.x);
                d7gVar2.c(e7hVar.y);
                d7gVar2.z(e7hVar.z);
                d7gVar2.h(e7hVar.A);
                int i2 = e7hVar.B;
                if (d7gVar2.v != i2) {
                    d7gVar2.a |= 524288;
                    d7gVar2.v = i2;
                }
                if (!Intrinsics.areEqual(null, null)) {
                    d7gVar2.a |= 262144;
                }
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                ffi ffiVar = (ffi) obj2;
                m23 m23Var = ffiVar.c;
                if (m23Var != null) {
                    m23Var.a(th);
                }
                ffiVar.c = null;
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6c(long j, Map map) {
        super(1);
        this.h = 6;
        this.i = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b6c(Object obj, int i) {
        super(1);
        this.h = i;
        this.i = obj;
    }
}

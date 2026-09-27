package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.text.StringsKt;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class ye9 {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final zrb a;
    public final StringBuilder b = new StringBuilder();
    public final StringBuilder c = new StringBuilder();
    public final lca d = xym.a();
    public final lca e = xym.a();
    private volatile /* synthetic */ int requestLogged = 0;
    private volatile /* synthetic */ int responseLogged = 0;

    static {
        Unsafe unsafe = oo4.a;
        f = unsafe.objectFieldOffset(ye9.class.getDeclaredField("requestLogged"));
        g = unsafe.objectFieldOffset(ye9.class.getDeclaredField("responseLogged"));
    }

    public ye9(zrb zrbVar) {
        this.a = zrbVar;
    }

    public final void a() {
        lca lcaVar = this.d;
        if (!oo4.a.compareAndSwapInt(this, f, 0, 1)) {
            return;
        }
        try {
            String obj = StringsKt.s0(this.b).toString();
            if (obj.length() > 0) {
                this.a.log(obj);
            }
            lcaVar.g();
        } catch (Throwable th) {
            lcaVar.g();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q55 q55Var) {
        ve9 ve9Var;
        int i;
        ye9 ye9Var;
        String obj;
        if (q55Var instanceof ve9) {
            ve9Var = (ve9) q55Var;
            int i2 = ve9Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ve9Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = ve9Var.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = ve9Var.m;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                        ye9Var = this;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    ye9Var = this;
                    if (!oo4.a.compareAndSwapInt(ye9Var, g, 0, 1)) {
                        return Unit.INSTANCE;
                    }
                    ve9Var.m = 1;
                    if (ye9Var.d.e0(ve9Var) == u85Var) {
                        return u85Var;
                    }
                }
                obj = StringsKt.s0(ye9Var.c).toString();
                if (obj.length() > 0) {
                    ye9Var.a.log(obj);
                }
                return Unit.INSTANCE;
            }
        }
        ve9Var = new ve9(this, q55Var);
        Object obj22 = ve9Var.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = ve9Var.m;
        if (i == 0) {
        }
        obj = StringsKt.s0(ye9Var.c).toString();
        if (obj.length() > 0) {
        }
        return Unit.INSTANCE;
    }

    public final void c(String str) {
        String obj = StringsKt.s0(str).toString();
        StringBuilder sb = this.b;
        sb.append(obj);
        sb.append('\n');
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, q55 q55Var) {
        we9 we9Var;
        int i;
        if (q55Var instanceof we9) {
            we9Var = (we9) q55Var;
            int i2 = we9Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                we9Var.n = i2 - Integer.MIN_VALUE;
                Object obj = we9Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = we9Var.n;
                if (i == 0) {
                    if (i == 1) {
                        str = we9Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    we9Var.k = str;
                    we9Var.n = 1;
                    if (this.e.e0(we9Var) == u85Var) {
                        return u85Var;
                    }
                }
                this.c.append(str);
                return Unit.INSTANCE;
            }
        }
        we9Var = new we9(this, q55Var);
        Object obj2 = we9Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = we9Var.n;
        if (i == 0) {
        }
        this.c.append(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, q55 q55Var) {
        xe9 xe9Var;
        int i;
        if (q55Var instanceof xe9) {
            xe9Var = (xe9) q55Var;
            int i2 = xe9Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xe9Var.n = i2 - Integer.MIN_VALUE;
                Object obj = xe9Var.l;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = xe9Var.n;
                if (i == 0) {
                    if (i == 1) {
                        str = xe9Var.k;
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    xe9Var.k = str;
                    xe9Var.n = 1;
                    if (this.d.e0(xe9Var) == u85Var) {
                        return u85Var;
                    }
                }
                this.a.log(StringsKt.s0(str).toString());
                return Unit.INSTANCE;
            }
        }
        xe9Var = new xe9(this, q55Var);
        Object obj2 = xe9Var.l;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = xe9Var.n;
        if (i == 0) {
        }
        this.a.log(StringsKt.s0(str).toString());
        return Unit.INSTANCE;
    }
}

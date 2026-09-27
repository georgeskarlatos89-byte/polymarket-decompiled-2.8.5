package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class iqb implements Function0 {
    public final nqb a;
    public final Function0 b;
    public volatile Object c = lqb.NOT_COMPUTED;

    public iqb(nqb nqbVar, Function0 function0) {
        this.a = nqbVar;
        this.b = function0;
    }

    public mqb b(boolean z) {
        mqb d = this.a.d(null, "in a lazy value");
        if (d != null) {
            return d;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue", "recursionDetected"));
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        Object obj = this.c;
        if (!(obj instanceof lqb)) {
            e4n.b(obj);
            return obj;
        }
        this.a.a.lock();
        try {
            Object obj2 = this.c;
            if (!(obj2 instanceof lqb)) {
                e4n.b(obj2);
            } else {
                lqb lqbVar = lqb.COMPUTING;
                if (obj2 == lqbVar) {
                    this.c = lqb.RECURSION_WAS_DETECTED;
                    mqb b = b(true);
                    if (!b.c) {
                        obj2 = b.b;
                    }
                }
                if (obj2 == lqb.RECURSION_WAS_DETECTED) {
                    mqb b2 = b(false);
                    if (!b2.c) {
                        obj2 = b2.b;
                    }
                }
                this.c = lqbVar;
                try {
                    obj2 = this.b.invoke();
                    a(obj2);
                    this.c = obj2;
                } catch (Throwable th) {
                    if (!cjj.f(th)) {
                        if (this.c == lqb.COMPUTING) {
                            this.c = new opk(th);
                        }
                        this.a.b.getClass();
                        throw th;
                    }
                    this.c = lqb.NOT_COMPUTED;
                    throw th;
                }
            }
            return obj2;
        } finally {
            this.a.a.unlock();
        }
    }

    public void a(Object obj) {
    }
}

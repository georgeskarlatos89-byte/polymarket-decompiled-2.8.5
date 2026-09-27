package defpackage;

import android.view.ViewTreeObserver;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class kqb implements Function1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ kqb(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 3 && i != 4) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 4) {
            i2 = 3;
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    objArr[0] = "storageManager";
                } else {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
                }
            } else {
                objArr[0] = "compute";
            }
        } else {
            objArr[0] = "map";
        }
        if (i != 3) {
            if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i == 3 || i == 4) {
            throw new IllegalStateException(format);
        }
    }

    public AssertionError b(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + lqb.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((nqb) this.b));
        nqb.e(assertionError);
        return assertionError;
    }

    public AssertionError c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((nqb) this.b));
        nqb.e(assertionError);
        return assertionError;
    }

    public AssertionError d(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((nqb) this.b), th);
        nqb.e(assertionError);
        return assertionError;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        AssertionError d;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                nqb nqbVar = (nqb) obj2;
                ndg ndgVar = nqbVar.b;
                i7h i7hVar = nqbVar.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj3;
                Object obj5 = concurrentHashMap.get(obj);
                Object obj6 = e4n.a;
                AssertionError assertionError = null;
                if (obj5 != null && obj5 != lqb.COMPUTING) {
                    e4n.b(obj5);
                    if (obj5 == obj6) {
                        return null;
                    }
                    return obj5;
                }
                i7hVar.lock();
                try {
                    Object obj7 = concurrentHashMap.get(obj);
                    lqb lqbVar = lqb.COMPUTING;
                    if (obj7 == lqbVar) {
                        obj7 = lqb.RECURSION_WAS_DETECTED;
                        mqb d2 = nqbVar.d(obj, "");
                        if (d2 != null) {
                            if (!d2.c) {
                                obj7 = d2.b;
                                return obj7;
                            }
                        } else {
                            a(3);
                            throw null;
                        }
                    }
                    if (obj7 == lqb.RECURSION_WAS_DETECTED) {
                        mqb d3 = nqbVar.d(obj, "");
                        if (d3 != null) {
                            if (!d3.c) {
                                obj7 = d3.b;
                                return obj7;
                            }
                        } else {
                            a(3);
                            throw null;
                        }
                    }
                    if (obj7 != null) {
                        e4n.b(obj7);
                        if (obj7 == obj6) {
                            obj7 = null;
                        }
                    } else {
                        try {
                            concurrentHashMap.put(obj, lqbVar);
                            obj7 = ((Function1) obj4).invoke(obj);
                            if (obj7 != null) {
                                obj6 = obj7;
                            }
                            Object put = concurrentHashMap.put(obj, obj6);
                            if (put != lqbVar) {
                                assertionError = c(obj, put);
                                throw assertionError;
                            }
                        } catch (Throwable th) {
                            if (cjj.f(th)) {
                                try {
                                    Object remove = concurrentHashMap.remove(obj);
                                    if (remove != lqb.COMPUTING) {
                                        throw b(obj, remove);
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                            if (th != assertionError) {
                                Object put2 = concurrentHashMap.put(obj, new opk(th));
                                if (put2 != lqb.COMPUTING) {
                                    throw c(obj, put2);
                                }
                                ndgVar.getClass();
                                throw th;
                            }
                            try {
                                concurrentHashMap.remove(obj);
                                ndgVar.getClass();
                                throw th;
                            } finally {
                            }
                        }
                    }
                    return obj7;
                } finally {
                    i7hVar.unlock();
                }
            case 1:
                rqf rqfVar = (rqf) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                jbk jbkVar = (jbk) obj4;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(jbkVar);
                } else {
                    rqfVar.a.getViewTreeObserver().removeOnPreDrawListener(jbkVar);
                }
                return Unit.INSTANCE;
            default:
                nnk nnkVar = (nnk) obj4;
                p6b p6bVar = (p6b) obj3;
                u39 u39Var = (u39) obj2;
                g gVar = g.a;
                if (u39Var.q0(gVar)) {
                    u39Var.m0(gVar, new yq8(14, p6bVar, nnkVar));
                } else {
                    p6bVar.c(nnkVar);
                }
                return Unit.INSTANCE;
        }
    }
}

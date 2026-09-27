package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class q3h implements ro5 {
    public final Function2 a;
    public final Function3 b;
    public final Context c;
    public final String d;
    public final Lazy e;
    public final LinkedHashSet f;

    public q3h(Context context, String str, Set set, Function2 function2, Function3 function3) {
        LinkedHashSet P0;
        context.getClass();
        set.getClass();
        function2.getClass();
        o3h o3hVar = new o3h(context, str);
        this.a = function2;
        this.b = function3;
        this.c = context;
        this.d = str;
        this.e = LazyKt.lazy(o3hVar);
        if (set == s3h.a) {
            P0 = null;
        } else {
            P0 = CollectionsKt.P0(set);
        }
        this.f = P0;
    }

    @Override // defpackage.ro5
    public final Object cleanUp(Continuation continuation) {
        Context context;
        String str;
        Lazy lazy = this.e;
        SharedPreferences.Editor edit = ((SharedPreferences) lazy.getValue()).edit();
        LinkedHashSet linkedHashSet = this.f;
        if (linkedHashSet == null) {
            edit.clear();
        } else {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (edit.commit()) {
            if (((SharedPreferences) lazy.getValue()).getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
                context.deleteSharedPreferences(str);
            }
            if (linkedHashSet != null) {
                linkedHashSet.clear();
            }
            return Unit.INSTANCE;
        }
        dmk.x("Unable to delete migrated keys from SharedPreferences.");
        return null;
    }

    @Override // defpackage.ro5
    public final Object migrate(Object obj, Continuation continuation) {
        return this.b.invoke(new w3h((SharedPreferences) this.e.getValue(), this.f), obj, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r4.isEmpty() == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ro5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldMigrate(Object obj, Continuation continuation) {
        p3h p3hVar;
        Object obj2;
        int i;
        if (continuation instanceof p3h) {
            p3hVar = (p3h) continuation;
            int i2 = p3hVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p3hVar.m = i2 - Integer.MIN_VALUE;
                obj2 = p3hVar.k;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = p3hVar.m;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj2);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj2);
                    p3hVar.m = 1;
                    obj2 = this.a.invoke(obj, p3hVar);
                    if (obj2 == u85Var) {
                        return u85Var;
                    }
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = this.f;
                Lazy lazy = this.e;
                if (linkedHashSet == null) {
                    Map<String, ?> all = ((SharedPreferences) lazy.getValue()).getAll();
                    all.getClass();
                } else {
                    SharedPreferences sharedPreferences = (SharedPreferences) lazy.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
            }
        }
        p3hVar = new p3h(this, (q55) continuation);
        obj2 = p3hVar.k;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = p3hVar.m;
        boolean z2 = true;
        if (i == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q3h(Context context, String str, gqg gqgVar, Function3 function3, int i) {
        this(context, str, r7, r8, r9);
        Function3 function32;
        Function2 function2;
        LinkedHashSet linkedHashSet = s3h.a;
        if ((i & 8) != 0) {
            function32 = function3;
            function2 = new p60(2, 7, null);
        } else {
            function32 = function3;
            function2 = gqgVar;
        }
    }
}

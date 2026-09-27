package defpackage;

import android.content.Intent;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class k8a {
    public final j9g a;
    public final String[] b;
    public final pej c;
    public final LinkedHashMap d;
    public final ReentrantLock e;
    public final hv9 f;
    public final hv9 g;
    public final ss9 h;
    public Intent i;
    public enc j;
    public final Object k;

    /* JADX WARN: Type inference failed for: r0v0, types: [pej, java.lang.Object] */
    public k8a(j9g j9gVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.a = j9gVar;
        this.b = strArr;
        boolean useTempTrackingTable$room_runtime_release = j9gVar.getUseTempTrackingTable$room_runtime_release();
        jv9 jv9Var = new jv9(1, this, k8a.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 3);
        ?? obj = new Object();
        obj.b = j9gVar;
        obj.c = hashMap;
        obj.d = hashMap2;
        obj.a = useTempTrackingTable$room_runtime_release;
        obj.e = jv9Var;
        obj.j = new AtomicBoolean(false);
        obj.k = new gz6(1);
        obj.f = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            ((LinkedHashMap) obj.f).put(lowerCase, Integer.valueOf(i));
            String str3 = (String) ((HashMap) obj.c).get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        obj.g = strArr2;
        for (Map.Entry entry : ((HashMap) obj.c).entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (((LinkedHashMap) obj.f).containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj.f;
                linkedHashMap.put(lowerCase3, d1c.c(linkedHashMap, lowerCase2));
            }
        }
        obj.h = new xfd(((String[]) obj.g).length);
        obj.i = new ba6(((String[]) obj.g).length);
        this.c = obj;
        this.d = new LinkedHashMap();
        this.e = new ReentrantLock();
        this.f = new hv9(this, 11);
        this.g = new hv9(this, 12);
        this.h = new ss9(j9gVar);
        this.k = new Object();
        obj.k = new bm7(this, 27);
    }

    public final boolean a(i8a i8aVar) {
        cgd cgdVar;
        LinkedHashMap linkedHashMap = this.d;
        String[] strArr = i8aVar.a;
        pej pejVar = this.c;
        Pair j = pejVar.j(strArr);
        String[] strArr2 = (String[]) j.first;
        int[] iArr = (int[]) j.second;
        cgd cgdVar2 = new cgd(i8aVar, iArr, strArr2);
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            if (linkedHashMap.containsKey(i8aVar)) {
                cgdVar = (cgd) d1c.c(linkedHashMap, i8aVar);
            } else {
                cgdVar = (cgd) linkedHashMap.put(i8aVar, cgdVar2);
            }
            reentrantLock.unlock();
            if (cgdVar == null && ((xfd) pejVar.h).a(iArr)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final a9g b(String[] strArr, boolean z, Callable callable) {
        this.c.j(strArr);
        ss9 ss9Var = this.h;
        ss9Var.getClass();
        return new a9g((j9g) ss9Var.b, ss9Var, z, strArr, callable);
    }

    public final void c(i8a i8aVar) {
        i8aVar.getClass();
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            cgd cgdVar = (cgd) this.d.remove(i8aVar);
            if (cgdVar != null) {
                int[] iArr = cgdVar.b;
                pej pejVar = this.c;
                pejVar.getClass();
                iArr.getClass();
                if (((xfd) pejVar.h).b(iArr)) {
                    qwn.b(new j8a(this, null, 1));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object d(zei zeiVar) {
        j9g j9gVar = this.a;
        if (j9gVar.inCompatibilityMode$room_runtime_release() && !j9gVar.isOpenInternal()) {
            return Unit.INSTANCE;
        }
        Object i = this.c.i(zeiVar);
        if (i == u85.COROUTINE_SUSPENDED) {
            return i;
        }
        return Unit.INSTANCE;
    }
}

package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sv9 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(KClass kClass, Function1 function1) {
        kClass.getClass();
        function1.getClass();
        LinkedHashMap linkedHashMap = this.a;
        if (!linkedHashMap.containsKey(kClass)) {
            linkedHashMap.put(kClass, new fak(kClass, function1));
        } else {
            fi9.j("A `initializer` with the same `clazz` has already been added: ", kClass.getQualifiedName(), 46);
        }
    }

    public final rv9 b() {
        Collection values = this.a.values();
        values.getClass();
        fak[] fakVarArr = (fak[]) values.toArray(new fak[0]);
        return new rv9((fak[]) Arrays.copyOf(fakVarArr, fakVarArr.length));
    }
}

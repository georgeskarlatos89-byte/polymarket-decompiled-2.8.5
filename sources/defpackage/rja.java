package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class rja extends vcf {
    public static final rja g = new vcf(sja.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);

    @Override // defpackage.vcf, defpackage.ska
    public final Object get(Object obj) {
        KClass kClass;
        KClass kClass2 = (KClass) obj;
        kClass2.getClass();
        List supertypes = kClass2.getSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator it = supertypes.iterator();
        while (it.hasNext()) {
            tja c = ((wka) it.next()).c();
            if (c instanceof KClass) {
                kClass = (KClass) c;
            } else {
                kClass = null;
            }
            if (kClass != null) {
                arrayList.add(kClass);
            }
        }
        return arrayList;
    }
}

package defpackage;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class qvf {
    private static final String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public KClass createKotlinClass(Class cls) {
        return new l44(cls);
    }

    public KClass getOrCreateKotlinClass(Class cls) {
        return new l44(cls);
    }

    public uja getOrCreateKotlinPackage(Class cls, String str) {
        return new xpd(cls);
    }

    public wka mutableCollectionType(wka wkaVar) {
        yhj yhjVar = (yhj) wkaVar;
        tja c = wkaVar.c();
        List d = wkaVar.d();
        yhjVar.getClass();
        return new yhj(c, d, yhjVar.c | 2);
    }

    public String renderLambdaToString(tp8 tp8Var) {
        String obj = tp8Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith(KOTLIN_JVM_FUNCTIONS)) {
            return obj.substring(21);
        }
        return obj;
    }

    public void setUpperBounds(yka ykaVar, List list) {
        rhj rhjVar = (rhj) ykaVar;
        rhjVar.getClass();
        list.getClass();
        if (rhjVar.c == null) {
            rhjVar.c = list;
        } else {
            omf.g(rhjVar, "' have already been initialized.", "Upper bounds of type parameter '");
        }
    }

    public wka typeOf(tja tjaVar, List list, boolean z) {
        tjaVar.getClass();
        list.getClass();
        return new yhj(tjaVar, list, z ? 1 : 0);
    }

    public yka typeParameter(Object obj, String str, fla flaVar, boolean z) {
        return new rhj(obj, flaVar);
    }

    public vja function(eq8 eq8Var) {
        return eq8Var;
    }

    public eka mutableProperty0(cqc cqcVar) {
        return cqcVar;
    }

    public gka mutableProperty1(dqc dqcVar) {
        return dqcVar;
    }

    public ika mutableProperty2(fqc fqcVar) {
        return fqcVar;
    }

    public qka property0(tcf tcfVar) {
        return tcfVar;
    }

    public ska property1(ucf ucfVar) {
        return ucfVar;
    }

    public uka property2(wcf wcfVar) {
        return wcfVar;
    }

    public String renderLambdaToString(Lambda lambda) {
        return renderLambdaToString((tp8) lambda);
    }
}

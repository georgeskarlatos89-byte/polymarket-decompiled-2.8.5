package defpackage;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final /* synthetic */ class sud extends fq8 implements Function1 {
    public static final sud f = new sud();

    public sud() {
        super(1, cjj.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Type type = (Type) obj;
        type.getClass();
        return cjj.g(type);
    }
}

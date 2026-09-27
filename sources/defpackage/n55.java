package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class n55 extends o55 {
    public final Function1 a;

    public n55(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.o55
    public final KSerializer a(List list) {
        list.getClass();
        return (KSerializer) this.a.invoke(list);
    }
}

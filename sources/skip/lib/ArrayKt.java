package skip.lib;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"arrayOf", "Lskip/lib/Array;", "Element", "elements", "", "([Ljava/lang/Object;)Lskip/lib/Array;", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrayKt {
    public static final <Element> Array<Element> arrayOf(Element... elementArr) {
        elementArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (Element element : elementArr) {
            arrayList.add(StructKt.sref$default(element, null, 1, null));
        }
        return new Array<>((Iterable) arrayList, true, false, 4, (DefaultConstructorMarker) null);
    }
}

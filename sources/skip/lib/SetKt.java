package skip.lib;

import java.util.LinkedHashSet;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0004\"\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"setOf", "Lskip/lib/Set;", "Element", "elements", "", "([Ljava/lang/Object;)Lskip/lib/Set;", "Set", "", "string", "", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SetKt {
    public static final Set<Character> Set(String str) {
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            linkedHashSet.add(Character.valueOf(str.charAt(i)));
        }
        return new Set<>(linkedHashSet, true, false, 4, null);
    }

    public static final <Element> Set<Element> setOf(Element... elementArr) {
        elementArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Element element : elementArr) {
            linkedHashSet.add(StructKt.sref$default(element, null, 1, null));
        }
        return new Set<>(linkedHashSet, true, false, 4, null);
    }
}

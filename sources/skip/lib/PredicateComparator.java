package skip.lib;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u0002H\u00010\u0002j\b\u0012\u0004\u0012\u0002H\u0001`\u0003B!\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000fR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lskip/lib/PredicateComparator;", "Element", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "lessThan", "Lkotlin/Function2;", "", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "getLessThan", "()Lkotlin/jvm/functions/Function2;", "compare", "", "p0", "p1", "(Ljava/lang/Object;Ljava/lang/Object;)I", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PredicateComparator<Element> implements Comparator<Element> {
    private final Function2<Element, Element, Boolean> lessThan;

    /* JADX WARN: Multi-variable type inference failed */
    public PredicateComparator(Function2<? super Element, ? super Element, Boolean> function2) {
        function2.getClass();
        this.lessThan = function2;
    }

    @Override // java.util.Comparator
    public int compare(Element p0, Element p1) {
        if (this.lessThan.invoke(p0, p1).booleanValue()) {
            return -1;
        }
        if (this.lessThan.invoke(p1, p0).booleanValue()) {
            return 1;
        }
        return 0;
    }

    public final Function2<Element, Element, Boolean> getLessThan() {
        return this.lessThan;
    }
}

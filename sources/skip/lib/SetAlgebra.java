package skip.lib;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import skip.lib.SetAlgebra;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000f\bf\u0018\u0000*\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ!\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0001H&¢\u0006\u0002\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00152\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00152\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0015\u0010\u0019\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\nJ\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001cJ\u0015\u0010!\u001a\u00020\u00152\u0006\u0010\t\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001cJ\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001cR\u0012\u0010\u001f\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$À\u0006\u0003"}, d2 = {"Lskip/lib/SetAlgebra;", "T", "Element", "", "contains", "", "element", "(Ljava/lang/Object;)Z", "union", "other", "(Lskip/lib/SetAlgebra;)Lskip/lib/SetAlgebra;", PlaceTypes.INTERSECTION, "symmetricDifference", "insert", "Lskip/lib/Tuple2;", "(Ljava/lang/Object;)Lskip/lib/Tuple2;", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "update", "with", "formUnion", "", "(Lskip/lib/SetAlgebra;)V", "formIntersection", "formSymmetricDifference", "subtracting", "isSubset", "of", "(Lskip/lib/SetAlgebra;)Z", "isDisjoint", "isSuperset", "isEmpty", "()Z", "subtract", "isStrictSubset", "isStrictSuperset", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SetAlgebra<T extends SetAlgebra<T, Element>, Element> {
    boolean contains(Element element);

    void formIntersection(T other);

    void formSymmetricDifference(T other);

    void formUnion(T other);

    Tuple2<Boolean, Element> insert(Element element);

    T intersection(T other);

    boolean isDisjoint(T with);

    boolean isEmpty();

    boolean isStrictSubset(T of);

    boolean isStrictSuperset(T of);

    boolean isSubset(T of);

    boolean isSuperset(T of);

    Element remove(Element element);

    void subtract(T other);

    T subtracting(T other);

    T symmetricDifference(T other);

    T union(T other);

    Element update(Element with);
}

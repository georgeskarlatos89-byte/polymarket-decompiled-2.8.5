package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Collection b;

    public /* synthetic */ p4(int i, Collection collection) {
        this.a = i;
        this.b = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.a;
        Collection<?> collection = this.b;
        switch (i) {
            case 0:
                contains = collection.contains(obj);
                break;
            case 1:
                contains = collection.contains(obj);
                break;
            case 2:
                contains = collection.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(contains);
    }
}

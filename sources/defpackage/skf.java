package defpackage;

import io.getstream.chat.android.models.querysort.ComparableFieldProvider;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySortByReflection;
import io.getstream.chat.android.models.querysort.SortDirection;
import java.util.Comparator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final /* synthetic */ class skf implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ SortDirection b;
    public final /* synthetic */ Object c;

    public /* synthetic */ skf(Object obj, SortDirection sortDirection, int i) {
        this.a = i;
        this.c = obj;
        this.b = sortDirection;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return QuerySortByField.a((String) this.c, this.b, (ComparableFieldProvider) obj, (ComparableFieldProvider) obj2);
            default:
                return QuerySortByReflection.b((ska) this.c, this.b, obj, obj2);
        }
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.text.b;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class r3c extends l3 {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public r3c(List list) {
        list.getClass();
        this.c = list;
    }

    @Override // defpackage.o1, java.util.Collection, java.util.Set
    public /* bridge */ boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains((String) obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                String group = ((b) obj).a.group(i);
                if (group == null) {
                    return "";
                }
                return group;
            default:
                return ((List) obj).get(kotlin.collections.b.k(i, this));
        }
    }

    @Override // defpackage.o1
    public final int getSize() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((b) obj).a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // defpackage.l3, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.indexOf((String) obj);
            default:
                return super.indexOf(obj);
        }
    }

    @Override // defpackage.l3, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.b) {
            case 1:
                return new g7g(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // defpackage.l3, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof String)) {
                    return -1;
                }
                return super.lastIndexOf((String) obj);
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // defpackage.l3, java.util.List
    public ListIterator listIterator() {
        switch (this.b) {
            case 1:
                return new g7g(this, 0);
            default:
                return super.listIterator();
        }
    }

    public r3c(b bVar) {
        this.c = bVar;
    }

    @Override // defpackage.l3, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.b) {
            case 1:
                return new g7g(this, i);
            default:
                return super.listIterator(i);
        }
    }
}

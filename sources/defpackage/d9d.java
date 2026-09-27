package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class d9d implements Iterator {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public d9d(gw1 gw1Var) {
        this.a = 1;
        this.b = new Stack();
        while (gw1Var instanceof hag) {
            hag hagVar = (hag) gw1Var;
            ((Stack) this.b).push(hagVar);
            gw1Var = hagVar.c;
        }
        this.c = (skb) gw1Var;
    }

    public skb a() {
        Stack stack = (Stack) this.b;
        skb skbVar = (skb) this.c;
        skb skbVar2 = null;
        if (skbVar == null) {
            dmk.t();
            return null;
        }
        while (true) {
            if (!stack.isEmpty()) {
                gw1 gw1Var = ((hag) stack.pop()).d;
                while (gw1Var instanceof hag) {
                    hag hagVar = (hag) gw1Var;
                    stack.push(hagVar);
                    gw1Var = hagVar.c;
                }
                skb skbVar3 = (skb) gw1Var;
                if (skbVar3.b.length != 0) {
                    skbVar2 = skbVar3;
                    break;
                }
            } else {
                break;
            }
        }
        this.c = skbVar2;
        return skbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                o8d o8dVar = (o8d) this.b;
                if (o8dVar == null || o8dVar == ((o8d) this.c)) {
                    return false;
                }
                return true;
            case 1:
                if (((skb) this.c) == null) {
                    return false;
                }
                return true;
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                o8d o8dVar = (o8d) this.b;
                this.b = o8dVar.e;
                return o8dVar;
            case 1:
                return a();
            default:
                Map.Entry entry = (Map.Entry) ((Iterator) this.c).next();
                this.b = entry;
                return entry.getKey();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("remove");
            case 1:
                throw new UnsupportedOperationException();
            default:
                Map.Entry entry = (Map.Entry) this.b;
                if (entry != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Collection collection = (Collection) entry.getValue();
                    ((Iterator) this.c).remove();
                    collection.size();
                    collection.clear();
                    this.b = null;
                    return;
                }
                dmk.n("no calls to next() since the last call to remove()");
                return;
        }
    }

    public d9d(o8d o8dVar, o8d o8dVar2) {
        this.a = 0;
        this.b = o8dVar;
        this.c = o8dVar2;
    }

    public d9d(d6l d6lVar, Iterator it) {
        this.a = 2;
        this.c = it;
    }
}

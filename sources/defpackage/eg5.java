package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class eg5 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public cg5 e;
    public dg5 f;
    public ig5 g;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                cg5 cg5Var = this.e;
                if (cg5Var != null) {
                    cursor2.unregisterContentObserver(cg5Var);
                }
                dg5 dg5Var = this.f;
                if (dg5Var != null) {
                    cursor2.unregisterDataSetObserver(dg5Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                cg5 cg5Var2 = this.e;
                if (cg5Var2 != null) {
                    cursor.registerContentObserver(cg5Var2);
                }
                dg5 dg5Var2 = this.f;
                if (dg5Var2 != null) {
                    cursor.registerDataSetObserver(dg5Var2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.a) {
            this.c.moveToPosition(i);
            if (view == null) {
                cci cciVar = (cci) this;
                view = cciVar.j.inflate(cciVar.i, viewGroup, false);
            }
            a(view, this.c);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ig5, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        ig5 ig5Var = this.g;
        if (ig5Var == null) {
            ?? filter = new Filter();
            filter.a = this;
            this.g = filter;
            return filter;
        }
        return ig5Var;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null) {
            cursor.moveToPosition(i);
            return this.c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.c.getLong(this.d);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.a) {
            if (this.c.moveToPosition(i)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.c);
                return view;
            }
            dmk.n(ace.f(i, "couldn't move cursor to position "));
            return null;
        }
        dmk.n("this should only be called when the cursor is valid");
        return null;
    }
}

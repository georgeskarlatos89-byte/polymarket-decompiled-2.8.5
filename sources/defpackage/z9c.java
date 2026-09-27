package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z9c extends BaseAdapter {
    public final cac a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public z9c(cac cacVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = cacVar;
        this.f = i;
        a();
    }

    public final void a() {
        cac cacVar = this.a;
        kac kacVar = cacVar.v;
        if (kacVar != null) {
            cacVar.i();
            ArrayList arrayList = cacVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((kac) arrayList.get(i)) == kacVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public final kac b(int i) {
        ArrayList l;
        boolean z = this.d;
        cac cacVar = this.a;
        if (z) {
            cacVar.i();
            l = cacVar.j;
        } else {
            l = cacVar.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (kac) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.d;
        cac cacVar = this.a;
        if (z) {
            cacVar.i();
            l = cacVar.j;
        } else {
            l = cacVar.l();
        }
        if (this.b < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return b(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i3 = b(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = b(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        ebc ebcVar = (ebc) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        ebcVar.b(b(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

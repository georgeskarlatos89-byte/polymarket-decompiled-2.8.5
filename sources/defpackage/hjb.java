package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.polymarket.android.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hjb extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ ijb b;

    public hjb(ijb ijbVar) {
        this.b = ijbVar;
        a();
    }

    public final void a() {
        cac cacVar = this.b.c;
        kac kacVar = cacVar.v;
        if (kacVar != null) {
            cacVar.i();
            ArrayList arrayList = cacVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((kac) arrayList.get(i)) == kacVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    public final kac b(int i) {
        cac cacVar = this.b.c;
        cacVar.i();
        ArrayList arrayList = cacVar.j;
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (kac) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        cac cacVar = this.b.c;
        cacVar.i();
        int size = cacVar.j.size();
        if (this.a < 0) {
            return size;
        }
        return size - 1;
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
        if (view == null) {
            view = this.b.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((ebc) view).b(b(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

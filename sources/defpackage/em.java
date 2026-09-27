package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class em implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ hm b;
    public final /* synthetic */ fm c;

    public em(fm fmVar, AlertController$RecycleListView alertController$RecycleListView, hm hmVar) {
        this.c = fmVar;
        this.a = alertController$RecycleListView;
        this.b = hmVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        fm fmVar = this.c;
        boolean[] zArr = fmVar.E;
        AlertController$RecycleListView alertController$RecycleListView = this.a;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        fmVar.I.onClick(this.b.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}

package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class dm implements AdapterView.OnItemClickListener {
    public final /* synthetic */ hm a;
    public final /* synthetic */ fm b;

    public dm(fm fmVar, hm hmVar) {
        this.b = fmVar;
        this.a = hmVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        fm fmVar = this.b;
        DialogInterface.OnClickListener onClickListener = fmVar.w;
        hm hmVar = this.a;
        onClickListener.onClick(hmVar.b, i);
        if (!fmVar.G) {
            hmVar.b.dismiss();
        }
    }
}

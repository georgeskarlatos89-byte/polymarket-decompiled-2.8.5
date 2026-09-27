package defpackage;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class cm extends CursorAdapter {
    public final int a;
    public final int b;
    public final /* synthetic */ AlertController$RecycleListView c;
    public final /* synthetic */ hm d;
    public final /* synthetic */ fm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(fm fmVar, ContextThemeWrapper contextThemeWrapper, Cursor cursor, AlertController$RecycleListView alertController$RecycleListView, hm hmVar) {
        super((Context) contextThemeWrapper, cursor, false);
        this.e = fmVar;
        this.c = alertController$RecycleListView;
        this.d = hmVar;
        Cursor cursor2 = getCursor();
        this.a = cursor2.getColumnIndexOrThrow(fmVar.K);
        this.b = cursor2.getColumnIndexOrThrow(fmVar.L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.a));
        int position = cursor.getPosition();
        int i = cursor.getInt(this.b);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.c.setItemChecked(position, z);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.e.b.inflate(this.d.L, viewGroup, false);
    }
}

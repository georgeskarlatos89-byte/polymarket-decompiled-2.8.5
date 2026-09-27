package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.polymarket.android.R;
import java.util.Calendar;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class nkc extends BaseAdapter {
    public static final int d = a1k.c(null).getMaximum(4);
    public static final int e = (a1k.c(null).getMaximum(7) + a1k.c(null).getMaximum(5)) - 1;
    public final ikc a;
    public ysk b;
    public final tu2 c;

    public nkc(ikc ikcVar, tu2 tu2Var) {
        this.a = ikcVar;
        this.c = tu2Var;
        throw null;
    }

    public final int a(int i) {
        do {
            i++;
            if (i > f()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int b(int i) {
        do {
            i--;
            if (i < c()) {
                return -1;
            }
        } while (!e(i));
        return i;
    }

    public final int c() {
        int i = this.c.e;
        ikc ikcVar = this.a;
        Calendar calendar = ikcVar.a;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + ikcVar.d;
        }
        return i3;
    }

    public final Long d(int i) {
        if (i >= c() && i <= f()) {
            int c = (i - c()) + 1;
            Calendar a = a1k.a(this.a.a);
            a.set(5, c);
            return Long.valueOf(a.getTimeInMillis());
        }
        return null;
    }

    public final boolean e(int i) {
        Long d2 = d(i);
        if (d2 != null) {
            if (d2.longValue() >= this.c.c.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int f() {
        return (c() + this.a.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return d(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.a.d;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new ysk(context, 14);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int c = i - c();
        if (c >= 0) {
            ikc ikcVar = this.a;
            if (c < ikcVar.e) {
                textView.setTag(ikcVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                if (d(i) == null || textView == null) {
                    return textView;
                }
                textView.getContext();
                a1k.b().getTimeInMillis();
                throw null;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        if (d(i) == null) {
            textView.getContext();
            a1k.b().getTimeInMillis();
            throw null;
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}

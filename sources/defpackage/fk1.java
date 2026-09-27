package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import com.polymarket.android.R;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class fk1 extends ArrayAdapter {
    public final /* synthetic */ int a = 1;
    public List b;
    public final Object c;
    public final Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(Context context, List list, int i, g75 g75Var) {
        super(context, i);
        Activity activity;
        list.getClass();
        this.b = list;
        this.c = g75Var;
        List list2 = this.b;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.d = new l95(list2, this, activity);
        this.e = this.b;
    }

    public k95 a(int i) {
        return (k95) ((List) this.e).get(i);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        switch (this.a) {
            case 0:
                return false;
            default:
                return super.areAllItemsEnabled();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        switch (this.a) {
            case 0:
                List list = this.b;
                if (list.isEmpty()) {
                    return 0;
                }
                return list.size() + 1;
            default:
                return ((List) this.e).size();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public Filter getFilter() {
        switch (this.a) {
            case 1:
                return (l95) this.d;
            default:
                return super.getFilter();
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    return null;
                }
                return (r43) super.getItem(i - 1);
            default:
                return a(i);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        switch (this.a) {
            case 1:
                return a(i).hashCode();
            default:
                return super.getItemId(i);
        }
    }

    @Override // android.widget.ArrayAdapter
    public int getPosition(Object obj) {
        switch (this.a) {
            case 1:
                List list = (List) this.e;
                list.getClass();
                return list.indexOf((k95) obj);
            default:
                return super.getPosition(obj);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        TextView textView;
        int i2 = this.a;
        Object obj = this.c;
        viewGroup.getClass();
        switch (i2) {
            case 0:
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                if (i == 0) {
                    inflate = layoutInflater.inflate(R.layout.stripe_select_card_brand_view, viewGroup, false);
                } else {
                    inflate = layoutInflater.inflate(R.layout.stripe_card_brand_choice_list_view, viewGroup, false);
                }
                if (i > 0) {
                    inflate.getClass();
                    int i3 = ((g6i) this.e).f;
                    boolean z = true;
                    r43 r43Var = (r43) CollectionsKt.J(i - 1, this.b);
                    if (r43Var != null) {
                        if (r43Var != ((r43) obj)) {
                            z = false;
                        }
                        ImageView imageView = (ImageView) inflate.findViewById(R.id.brand_icon);
                        if (imageView != null) {
                            imageView.setImageResource(r43Var.m());
                            imageView.setContentDescription(r43Var.i());
                        }
                        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.brand_check);
                        if (z) {
                            imageView2.setVisibility(0);
                            imageView2.setColorFilter(i3);
                        } else {
                            imageView2.setVisibility(8);
                        }
                        TextView textView2 = (TextView) inflate.findViewById(R.id.brand_text);
                        if (textView2 != null) {
                            textView2.setText(r43Var.i());
                            if (z) {
                                textView2.setTextColor(i3);
                                textView2.setTypeface(Typeface.DEFAULT_BOLD);
                            } else {
                                textView2.setTypeface(Typeface.DEFAULT);
                            }
                        }
                    }
                }
                inflate.getClass();
                return inflate;
            default:
                if (view instanceof TextView) {
                    textView = (TextView) view;
                } else {
                    textView = (TextView) ((g75) obj).invoke(viewGroup);
                }
                textView.setText(a(i).b);
                return textView;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        switch (this.a) {
            case 0:
                if (i != 0) {
                    return true;
                }
                return false;
            default:
                return super.isEnabled(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk1(Context context, List list, r43 r43Var) {
        super(context, 0, list);
        context.getClass();
        list.getClass();
        this.b = list;
        this.c = r43Var;
        this.d = LayoutInflater.from(context);
        this.e = new g6i(context);
    }
}

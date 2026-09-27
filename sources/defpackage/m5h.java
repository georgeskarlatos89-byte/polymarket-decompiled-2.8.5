package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.polymarket.android.R;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class m5h extends RelativeLayout {
    public final int a;
    public final int b;
    public final int c;
    public final c9i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5h(Context context) {
        super(context, null, 0);
        context.getClass();
        g6i g6iVar = new g6i(context);
        LayoutInflater.from(context).inflate(R.layout.stripe_shipping_method_view, this);
        int i = R.id.description;
        TextView textView = (TextView) m4n.d(this, R.id.description);
        if (textView != null) {
            i = R.id.name;
            TextView textView2 = (TextView) m4n.d(this, R.id.name);
            if (textView2 != null) {
                i = R.id.price;
                TextView textView3 = (TextView) m4n.d(this, R.id.price);
                if (textView3 != null) {
                    i = R.id.selected_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) m4n.d(this, R.id.selected_icon);
                    if (appCompatImageView != null) {
                        this.d = new c9i(this, textView, textView2, textView3, appCompatImageView);
                        int i2 = g6iVar.b;
                        this.a = Color.alpha(i2) < 16 ? d55.d(context, R.color.stripe_accent_color_default) : i2;
                        int i3 = g6iVar.d;
                        this.c = Color.alpha(i3) < 16 ? d55.d(context, R.color.stripe_color_text_unselected_primary_default) : i3;
                        int i4 = g6iVar.e;
                        this.b = Color.alpha(i4) < 16 ? d55.d(context, R.color.stripe_color_text_unselected_secondary_default) : i4;
                        return;
                    }
                }
            }
        }
        dmk.s("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        c9i c9iVar = this.d;
        if (z) {
            TextView textView = c9iVar.c;
            int i = this.a;
            textView.setTextColor(i);
            c9iVar.b.setTextColor(i);
            c9iVar.d.setTextColor(i);
            c9iVar.e.setVisibility(0);
            return;
        }
        TextView textView2 = c9iVar.c;
        int i2 = this.c;
        textView2.setTextColor(i2);
        c9iVar.b.setTextColor(this.b);
        c9iVar.d.setTextColor(i2);
        c9iVar.e.setVisibility(4);
    }

    public final void setShippingMethod(j5h j5hVar) {
        j5hVar.getClass();
        c9i c9iVar = this.d;
        c9iVar.c.setText(j5hVar.a);
        c9iVar.b.setText(j5hVar.e);
        TextView textView = c9iVar.d;
        long j = j5hVar.c;
        Currency currency = j5hVar.d;
        String string = getContext().getString(R.string.stripe_price_free);
        string.getClass();
        currency.getClass();
        if (j != 0) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.getClass();
            DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            double pow = j / Math.pow(10.0d, wf5.a(currency));
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance();
            try {
                currencyInstance2.getClass();
                DecimalFormatSymbols decimalFormatSymbols2 = ((DecimalFormat) currencyInstance2).getDecimalFormatSymbols();
                decimalFormatSymbols2.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
                ((DecimalFormat) currencyInstance2).setDecimalFormatSymbols(decimalFormatSymbols2);
                String format = ((DecimalFormat) currencyInstance2).format(pow);
                format.getClass();
                string = format;
            } catch (ClassCastException unused) {
                string = currencyInstance2.format(pow);
                string.getClass();
            }
        }
        textView.setText(string);
    }
}

package com.google.android.libraries.places.internal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.g;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.model.FuelPrice;
import java.time.Instant;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class zzvi extends c {
    private final List zza;
    private final Instant zzb;

    public zzvi(List list, Instant instant) {
        list.getClass();
        this.zza = list;
        this.zzb = instant;
    }

    @Override // androidx.recyclerview.widget.c
    public final int getItemCount() {
        return this.zza.size();
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ void onBindViewHolder(g gVar, int i) {
        String string;
        String string2;
        zzvh zzvhVar = (zzvh) gVar;
        zzvhVar.getClass();
        FuelPrice fuelPrice = (FuelPrice) this.zza.get(i);
        Context context = zzvhVar.itemView.getContext();
        TextView zza = zzvhVar.zza();
        FuelPrice.FuelType type = fuelPrice.getType();
        type.getClass();
        context.getClass();
        type.getClass();
        context.getClass();
        FuelPrice.FuelType fuelType = FuelPrice.FuelType.FUEL_TYPE_UNSPECIFIED;
        int ordinal = type.ordinal();
        if (ordinal != 1) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        string = "";
                    } else {
                        string = context.getString(R.string.fuel_type_premium);
                        string.getClass();
                    }
                } else {
                    string = context.getString(R.string.fuel_type_midgrade);
                    string.getClass();
                }
            } else {
                string = context.getString(R.string.fuel_type_regular);
                string.getClass();
            }
        } else {
            string = context.getString(R.string.fuel_type_diesel);
            string.getClass();
        }
        zza.setText(string);
        TextView zzb = zzvhVar.zzb();
        Instant instant = this.zzb;
        context.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        Currency currency = Currency.getInstance(fuelPrice.getPrice().getCurrencyCode());
        currency.getClass();
        String symbol = currency.getSymbol(locale);
        symbol.getClass();
        String format = String.format(locale, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf((fuelPrice.getPrice().getNanos().intValue() / 1.0E9d) + fuelPrice.getPrice().getUnits().longValue())}, 1));
        if (com.google.android.libraries.places.widget.internal.placedetails.zzv.zzb(fuelPrice, instant)) {
            string2 = context.getString(R.string.stale_fuel_price, symbol, format);
            string2.getClass();
        } else {
            string2 = context.getString(R.string.fuel_price, symbol, format);
            string2.getClass();
        }
        zzb.setText(string2);
    }

    @Override // androidx.recyclerview.widget.c
    public final /* bridge */ /* synthetic */ g onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fuel_option_item, viewGroup, false);
        inflate.getClass();
        return new zzvh(inflate);
    }
}

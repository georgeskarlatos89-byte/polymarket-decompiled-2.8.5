package com.checkout.components.wallet.common;

import com.checkout.components.wallet.data.model.Currency;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "", "isInvalidAmount", "(Ljava/lang/String;)Z", "Lcom/checkout/components/wallet/data/model/Currency;", "toCurrency", "(Ljava/lang/String;)Lcom/checkout/components/wallet/data/model/Currency;", "", "currency", "getFormattedAmount", "(ILcom/checkout/components/wallet/data/model/Currency;)Ljava/lang/String;", "wallet_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CurrencyExtensionsKt {
    public static final String getFormattedAmount(int i, Currency currency) {
        currency.getClass();
        Currency.INSTANCE.getClass();
        if (Currency.access$getCurrenciesWithZeroDecimals$cp().contains(currency)) {
            return String.valueOf(i);
        }
        if (Currency.access$getCurrenciesWithThreeDecimals$cp().contains(currency)) {
            BigDecimal divide = new BigDecimal(i).divide(new BigDecimal(1000), 2, RoundingMode.HALF_UP);
            divide.getClass();
            String format = new DecimalFormat(Constants.DECIMAL_FORMAT_PATTERN, new DecimalFormatSymbols(Locale.US)).format(divide);
            format.getClass();
            return format;
        }
        BigDecimal divide2 = new BigDecimal(i).divide(new BigDecimal(100), 2, RoundingMode.HALF_UP);
        divide2.getClass();
        String format2 = new DecimalFormat(Constants.DECIMAL_FORMAT_PATTERN, new DecimalFormatSymbols(Locale.US)).format(divide2);
        format2.getClass();
        return format2;
    }

    public static final boolean isInvalidAmount(String str) {
        str.getClass();
        return !Constants.INSTANCE.getTOTAL_PRICE_REGEX$wallet_standardRelease().d(str);
    }

    public static final Currency toCurrency(String str) {
        str.getClass();
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            Currency.Companion companion = Currency.INSTANCE;
            return (Currency) Enum.valueOf(Currency.class, upperCase);
        } catch (IllegalArgumentException unused) {
            return Currency.UNKNOWN;
        }
    }
}

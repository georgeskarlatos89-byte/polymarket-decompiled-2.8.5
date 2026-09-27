package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import defpackage.ix2;
import java.math.BigDecimal;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public enum ToNumberPolicy implements ToNumberStrategy {
    DOUBLE { // from class: com.google.gson.ToNumberPolicy.1
        @Override // com.google.gson.ToNumberStrategy
        public Double readNumber(JsonReader jsonReader) {
            return Double.valueOf(jsonReader.nextDouble());
        }

        @Override // com.google.gson.ToNumberStrategy
        public /* bridge */ /* synthetic */ Number readNumber(JsonReader jsonReader) {
            return readNumber(jsonReader);
        }
    },
    LAZILY_PARSED_NUMBER { // from class: com.google.gson.ToNumberPolicy.2
        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) {
            return new LazilyParsedNumber(jsonReader.nextString());
        }
    },
    LONG_OR_DOUBLE { // from class: com.google.gson.ToNumberPolicy.3
        private Number parseAsDouble(String str, JsonReader jsonReader) {
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (!jsonReader.isLenient()) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + valueOf + "; at path " + jsonReader.getPreviousPath());
                }
                return valueOf;
            } catch (NumberFormatException e) {
                StringBuilder s = ix2.s("Cannot parse ", str, "; at path ");
                s.append(jsonReader.getPreviousPath());
                throw new JsonParseException(s.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberStrategy
        public Number readNumber(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            if (nextString.indexOf(46) >= 0) {
                return parseAsDouble(nextString, jsonReader);
            }
            try {
                return Long.valueOf(Long.parseLong(nextString));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(nextString, jsonReader);
            }
        }
    },
    BIG_DECIMAL { // from class: com.google.gson.ToNumberPolicy.4
        @Override // com.google.gson.ToNumberStrategy
        public BigDecimal readNumber(JsonReader jsonReader) {
            String nextString = jsonReader.nextString();
            try {
                return NumberLimits.parseBigDecimal(nextString);
            } catch (NumberFormatException e) {
                StringBuilder s = ix2.s("Cannot parse ", nextString, "; at path ");
                s.append(jsonReader.getPreviousPath());
                throw new JsonParseException(s.toString(), e);
            }
        }

        @Override // com.google.gson.ToNumberStrategy
        public /* bridge */ /* synthetic */ Number readNumber(JsonReader jsonReader) {
            return readNumber(jsonReader);
        }
    };

    /* synthetic */ ToNumberPolicy(AnonymousClass1 anonymousClass1) {
        this();
    }
}

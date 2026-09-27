package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.JavaVersion;
import com.google.gson.internal.PreJava9DateFormatProvider;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.ix2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {
    public static final TypeAdapterFactory DEFAULT_STYLE_FACTORY = new TypeAdapterFactory() { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.1
        @Override // com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Date.class) {
                return null;
            }
            return new DefaultDateTypeAdapter(DateType.DATE, 2, 2, null);
        }

        public String toString() {
            return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
        }
    };
    private static final String SIMPLE_NAME = "DefaultDateTypeAdapter";
    private final List<DateFormat> dateFormats;
    private final DateType<T> dateType;

    private DefaultDateTypeAdapter(DateType<T> dateType, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Objects.requireNonNull(dateType);
        this.dateType = dateType;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (JavaVersion.isJava9OrLater()) {
            arrayList.add(PreJava9DateFormatProvider.getUsDateTimeFormat(i, i2));
        }
    }

    private Date deserializeToDate(JsonReader jsonReader) {
        String nextString = jsonReader.nextString();
        synchronized (this.dateFormats) {
            try {
                Iterator<DateFormat> it = this.dateFormats.iterator();
                while (it.hasNext()) {
                    DateFormat next = it.next();
                    TimeZone timeZone = next.getTimeZone();
                    try {
                        try {
                            return next.parse(nextString);
                        } finally {
                            next.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        next.setTimeZone(timeZone);
                    }
                }
                try {
                    return ISO8601Utils.parse(nextString, new ParsePosition(0));
                } catch (ParseException e) {
                    StringBuilder s = ix2.s("Failed parsing '", nextString, "' as Date; at path ");
                    s.append(jsonReader.getPreviousPath());
                    throw new JsonSyntaxException(s.toString(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public T read(JsonReader jsonReader) {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.dateType.deserialize(deserializeToDate(jsonReader));
    }

    public String toString() {
        DateFormat dateFormat = this.dateFormats.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    public void write(JsonWriter jsonWriter, Date date) {
        String format;
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        DateFormat dateFormat = this.dateFormats.get(0);
        synchronized (this.dateFormats) {
            format = dateFormat.format(date);
        }
        jsonWriter.value(format);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes3.dex */
    public static abstract class DateType<T extends Date> {
        public static final DateType<Date> DATE = new DateType<Date>(Date.class) { // from class: com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.1
            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType
            public Date deserialize(Date date) {
                return date;
            }
        };
        private final Class<T> dateClass;

        public DateType(Class<T> cls) {
            this.dateClass = cls;
        }

        private TypeAdapterFactory createFactory(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.newFactory(this.dateClass, defaultDateTypeAdapter);
        }

        public final TypeAdapterFactory createAdapterFactory(String str) {
            return createFactory(new DefaultDateTypeAdapter<>(this, str, (AnonymousClass1) null));
        }

        public abstract T deserialize(Date date);

        public final TypeAdapterFactory createAdapterFactory(int i, int i2) {
            return createFactory(new DefaultDateTypeAdapter<>(this, i, i2, null));
        }
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ Object read(JsonReader jsonReader) {
        return read(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(JsonWriter jsonWriter, Object obj) {
        write(jsonWriter, (Date) obj);
    }

    public /* synthetic */ DefaultDateTypeAdapter(DateType dateType, String str, AnonymousClass1 anonymousClass1) {
        this(dateType, str);
    }

    private DefaultDateTypeAdapter(DateType<T> dateType, String str) {
        ArrayList arrayList = new ArrayList();
        this.dateFormats = arrayList;
        Objects.requireNonNull(dateType);
        this.dateType = dateType;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public /* synthetic */ DefaultDateTypeAdapter(DateType dateType, int i, int i2, AnonymousClass1 anonymousClass1) {
        this(dateType, i, i2);
    }
}

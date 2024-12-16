package br.com.appcontatos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBCore extends SQLiteOpenHelper {
    private static final String NOME_BANCO = "contatos.db";
    private static final int VERSAO = 1;

    public static final String TABLE_CONTATOS = "contatos";
    public static final String ID = "_id";
    public static final String EMAIL = "email";
    public static final String NOME = "nome";

    private static final String CREATE_TABLE_CONTATOS =
        "CREATE TABLE " + TABLE_CONTATOS +
        " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
        NOME + " TEXT NOT NULL, " +
        EMAIL + " TEXT NOT NULL)";

    public DBCore(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_CONTATOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade logic here
    }
}

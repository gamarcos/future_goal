package br.com.gabrielmarcos.core.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import br.com.gabrielmarcos.core.model.Goal;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GoalDAO_Impl implements GoalDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Goal> __insertionAdapterOfGoal;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllGoals;

  private final SharedSQLiteStatement __preparedStmtOfDeleteGoalByID;

  public GoalDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGoal = new EntityInsertionAdapter<Goal>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `future_goal` (`id`,`title`,`description`,`status`,`initAt`,`finishAt`,`remember`,`rememberAt`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Goal value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getStatus());
        }
        stmt.bindLong(5, value.getInitAt());
        if (value.getFinishAt() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getFinishAt());
        }
        final Integer _tmp;
        _tmp = value.getRemember() == null ? null : (value.getRemember() ? 1 : 0);
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getRememberAt() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getRememberAt());
        }
      }
    };
    this.__preparedStmtOfDeleteAllGoals = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM future_goal";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteGoalByID = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM future_goal WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertGoal(final Goal arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGoal.insert(arg0);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteAllGoals(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllGoals.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllGoals.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object deleteGoalByID(final long arg0, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteGoalByID.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, arg0);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteGoalByID.release(_stmt);
        }
      }
    }, arg1);
  }

  @Override
  public LiveData<List<Goal>> getAllGoals() {
    final String _sql = "SELECT * FROM future_goal";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"future_goal"}, false, new Callable<List<Goal>>() {
      @Override
      public List<Goal> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfInitAt = CursorUtil.getColumnIndexOrThrow(_cursor, "initAt");
          final int _cursorIndexOfFinishAt = CursorUtil.getColumnIndexOrThrow(_cursor, "finishAt");
          final int _cursorIndexOfRemember = CursorUtil.getColumnIndexOrThrow(_cursor, "remember");
          final int _cursorIndexOfRememberAt = CursorUtil.getColumnIndexOrThrow(_cursor, "rememberAt");
          final List<Goal> _result = new ArrayList<Goal>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Goal _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpStatus;
            _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            final long _tmpInitAt;
            _tmpInitAt = _cursor.getLong(_cursorIndexOfInitAt);
            final Long _tmpFinishAt;
            if (_cursor.isNull(_cursorIndexOfFinishAt)) {
              _tmpFinishAt = null;
            } else {
              _tmpFinishAt = _cursor.getLong(_cursorIndexOfFinishAt);
            }
            final Boolean _tmpRemember;
            final Integer _tmp;
            if (_cursor.isNull(_cursorIndexOfRemember)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(_cursorIndexOfRemember);
            }
            _tmpRemember = _tmp == null ? null : _tmp != 0;
            final Long _tmpRememberAt;
            if (_cursor.isNull(_cursorIndexOfRememberAt)) {
              _tmpRememberAt = null;
            } else {
              _tmpRememberAt = _cursor.getLong(_cursorIndexOfRememberAt);
            }
            _item = new Goal(_tmpId,_tmpTitle,_tmpDescription,_tmpStatus,_tmpInitAt,_tmpFinishAt,_tmpRemember,_tmpRememberAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}

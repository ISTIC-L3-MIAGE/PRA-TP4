import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

public class ChargeGrid {
	private Connection connexion;

	public ChargeGrid() {
		try {
			connexion = connecterBD();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection connecterBD() throws SQLException {
		Connection connect;
		connect = DriverManager.getConnection("xxx", "user_jmartin", "yyy");
		return connect;
	}

// Retourne la liste des grilles disponibles dans la BD
// Chaque grille est décrite par la concaténation des valeurs
// respectives des colonnes nom_grille, hauteur et largeur.
// L’élément de liste ainsi obtenu est indexé par le numéro de
// la grille (colonne num_grille).
	// Ainsi "Français débutants (7x6)" devrait être associé à la clé 10

	public Map<Integer, String> availableGrids() {
	}

	public Crossword extractGrid(int numGrille) {
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.util.ArrayList;
import modelos.Produto;

/**
 *
 * @author Desenvolvimento
 */
public class Mock {

   private static ArrayList<Produto> lista;

   public static void makeMock(){

      if(lista == null){
         lista = Produto.getLista();

         Produto caneta = new Produto();
         caneta.setDescricao("Caneta da Polih ");
         caneta.setPreco(1.5f);
         caneta.setOferta(true);
         lista.add(caneta);

         Produto caderno = new Produto();
         caderno.setDescricao("Caderno do Batimam");
         caderno.setPreco(5.0f);
         caderno.setOferta(false);
         lista.add(caderno);

         Produto mochila = new Produto();
         mochila.setDescricao("Mochila da barbi");
         mochila.setPreco(40.5f);
         mochila.setOferta(true);
         lista.add(mochila);

         Produto corretivo = new Produto();
         corretivo.setDescricao("Corretivo do Bem 10");
         corretivo.setPreco(3.5f);
         corretivo.setOferta(false);
         lista.add(corretivo);

         Produto borracha = new Produto();
         borracha.setDescricao("Borracha do Escobidu");
         borracha.setPreco(1.0f);
         borracha.setOferta(true);
         lista.add(borracha);

         Produto apontador = new Produto();
         apontador.setDescricao("Apontador das Uinquis");
         apontador.setPreco(1.5f);
         apontador.setOferta(false);
         lista.add(apontador);

      }

   }

}

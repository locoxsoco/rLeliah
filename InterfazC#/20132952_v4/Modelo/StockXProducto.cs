﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Modelo
{
    public class StockXProducto
    {
        private int idProducto;
        private string nombre;
        private double precio;
        private string marca;
        private string descripcion;
        private int cantMinima;
        private int stock;
        private DateTime fechaVencimiento;
        private string categoria;
        private int consumible;

        public int IdProducto { get => idProducto; set => idProducto = value; }
        public string Nombre { get => nombre; set => nombre = value; }
        public double Precio { get => precio; set => precio = value; }
        public string Marca { get => marca; set => marca = value; }
        public string Descripcion { get => descripcion; set => descripcion = value; }
        public int CantMinima { get => cantMinima; set => cantMinima = value; }
        public int Stock { get => stock; set => stock = value; }
        public DateTime FechaVencimiento { get => fechaVencimiento; set => fechaVencimiento = value; }
        public string Categoria { get => categoria; set => categoria = value; }
        public int Consumible { get => consumible; set => consumible = value; }
    }
}
